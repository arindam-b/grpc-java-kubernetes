package fr.arindam.grpc.server;

import java.io.IOException;

import fr.arindam.grpc.service.CloudService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.out.println("Starting GRPC Server");
		
		Server server = ServerBuilder.forPort(8080).addService(new CloudService()).build();
		
		server.start();
		
		System.out.println("Server Started on Port "+server.getPort());
		
		server.awaitTermination();
	}
}
