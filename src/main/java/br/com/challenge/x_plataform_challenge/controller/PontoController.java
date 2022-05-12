package br.com.challenge.x_plataform_challenge.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class PontoController {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executor = Executors.newFixedThreadPool(10);

		List<Future<BatimentoPonto>> future = executor.invokeAll(null, 10L, TimeUnit.SECONDS);

		for (Future<BatimentoPonto> f : future) {
			try {
				if (!f.isCancelled()) {
					BatimentoPonto result = f.get();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		;

		executor.shutdown();

	}

}
