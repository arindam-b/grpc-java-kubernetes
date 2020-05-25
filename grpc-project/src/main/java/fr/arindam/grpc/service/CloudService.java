package fr.arindam.grpc.service;

import fr.arindam.grpc.Cloud.CloudRequest;
import fr.arindam.grpc.Cloud.CloudResponse;
import fr.arindam.grpc.cloudGrpc.cloudImplBase;
import io.grpc.stub.StreamObserver;

public class CloudService extends cloudImplBase {

	@Override
	public void getSpecific(CloudRequest request, StreamObserver<CloudResponse> responseObserver) {
		
		int cloud_provider_id = Integer.parseInt(request.getId());
		
		CloudResponse.Builder response = CloudResponse.newBuilder();
		
		int number_of_region =  0;
		
		String provider_name = null;
		
		switch(cloud_provider_id) {
			case 1:
				number_of_region = 70;
				provider_name = "AWS";
				break;
			case 2:
				number_of_region = 80;
				provider_name = "Azure";
				break;
			case 3:
				number_of_region = 90;
				provider_name = "GCP";
				break;	
			default:
				provider_name = "Not found";
		}
		
		response.setNumberOfRegionAvailable(number_of_region);
		response.setProviderName(provider_name);
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

}
