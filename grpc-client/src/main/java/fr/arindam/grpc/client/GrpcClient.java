package fr.arindam.grpc.client;

import java.util.concurrent.ThreadLocalRandom;

import fr.arindam.grpc.Cloud.CloudRequest;
import fr.arindam.grpc.Cloud.CloudResponse;
import fr.arindam.grpc.cloudGrpc;
import fr.arindam.grpc.cloudGrpc.cloudBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

	public static void main(String[] args) throws InterruptedException {

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();

		cloudBlockingStub cloudStub = cloudGrpc.newBlockingStub(channel);

		int randomNum = 0;

		while(true) {

			randomNum = ThreadLocalRandom.current().nextInt(1, 3);

			CloudRequest request = CloudRequest.newBuilder()
					.setId(String.valueOf(randomNum))
					.build();

			CloudResponse response = cloudStub.getSpecific(request);

			System.out.println("Received Response: "+response.getProviderName()+ " "+response.getNumberOfRegionAvailable());

			Thread.sleep(5000);
		}
	}
}
