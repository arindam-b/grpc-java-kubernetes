package fr.arindam.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: cloud.proto")
public final class cloudGrpc {

  private cloudGrpc() {}

  public static final String SERVICE_NAME = "cloud";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<fr.arindam.grpc.Cloud.CloudRequest,
      fr.arindam.grpc.Cloud.CloudResponse> getGetSpecificMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSpecific",
      requestType = fr.arindam.grpc.Cloud.CloudRequest.class,
      responseType = fr.arindam.grpc.Cloud.CloudResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fr.arindam.grpc.Cloud.CloudRequest,
      fr.arindam.grpc.Cloud.CloudResponse> getGetSpecificMethod() {
    io.grpc.MethodDescriptor<fr.arindam.grpc.Cloud.CloudRequest, fr.arindam.grpc.Cloud.CloudResponse> getGetSpecificMethod;
    if ((getGetSpecificMethod = cloudGrpc.getGetSpecificMethod) == null) {
      synchronized (cloudGrpc.class) {
        if ((getGetSpecificMethod = cloudGrpc.getGetSpecificMethod) == null) {
          cloudGrpc.getGetSpecificMethod = getGetSpecificMethod = 
              io.grpc.MethodDescriptor.<fr.arindam.grpc.Cloud.CloudRequest, fr.arindam.grpc.Cloud.CloudResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cloud", "getSpecific"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fr.arindam.grpc.Cloud.CloudRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fr.arindam.grpc.Cloud.CloudResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new cloudMethodDescriptorSupplier("getSpecific"))
                  .build();
          }
        }
     }
     return getGetSpecificMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static cloudStub newStub(io.grpc.Channel channel) {
    return new cloudStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static cloudBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new cloudBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static cloudFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new cloudFutureStub(channel);
  }

  /**
   */
  public static abstract class cloudImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSpecific(fr.arindam.grpc.Cloud.CloudRequest request,
        io.grpc.stub.StreamObserver<fr.arindam.grpc.Cloud.CloudResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSpecificMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSpecificMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fr.arindam.grpc.Cloud.CloudRequest,
                fr.arindam.grpc.Cloud.CloudResponse>(
                  this, METHODID_GET_SPECIFIC)))
          .build();
    }
  }

  /**
   */
  public static final class cloudStub extends io.grpc.stub.AbstractStub<cloudStub> {
    private cloudStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cloudStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cloudStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cloudStub(channel, callOptions);
    }

    /**
     */
    public void getSpecific(fr.arindam.grpc.Cloud.CloudRequest request,
        io.grpc.stub.StreamObserver<fr.arindam.grpc.Cloud.CloudResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSpecificMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class cloudBlockingStub extends io.grpc.stub.AbstractStub<cloudBlockingStub> {
    private cloudBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cloudBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cloudBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cloudBlockingStub(channel, callOptions);
    }

    /**
     */
    public fr.arindam.grpc.Cloud.CloudResponse getSpecific(fr.arindam.grpc.Cloud.CloudRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSpecificMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class cloudFutureStub extends io.grpc.stub.AbstractStub<cloudFutureStub> {
    private cloudFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cloudFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cloudFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cloudFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fr.arindam.grpc.Cloud.CloudResponse> getSpecific(
        fr.arindam.grpc.Cloud.CloudRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSpecificMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SPECIFIC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final cloudImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(cloudImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SPECIFIC:
          serviceImpl.getSpecific((fr.arindam.grpc.Cloud.CloudRequest) request,
              (io.grpc.stub.StreamObserver<fr.arindam.grpc.Cloud.CloudResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class cloudBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    cloudBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return fr.arindam.grpc.Cloud.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("cloud");
    }
  }

  private static final class cloudFileDescriptorSupplier
      extends cloudBaseDescriptorSupplier {
    cloudFileDescriptorSupplier() {}
  }

  private static final class cloudMethodDescriptorSupplier
      extends cloudBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    cloudMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (cloudGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new cloudFileDescriptorSupplier())
              .addMethod(getGetSpecificMethod())
              .build();
        }
      }
    }
    return result;
  }
}
