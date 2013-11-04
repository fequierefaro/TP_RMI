package tp.example.server;

import java.rmi.RemoteException;
import tp.example.itf.ReceiveMessageInterface;

public class ReceiveMessageImpl extends java.rmi.server.UnicastRemoteObject implements ReceiveMessageInterface {

 protected ReceiveMessageImpl() throws RemoteException {
  super();
  // TODO Auto-generated constructor stub
 }

 private static final long serialVersionUID = 7683221993606090701L;
 private long count = 0;

 @Override
 public String receiveMessage(String x) throws RemoteException {
  System.out.print("On Server ["+ (++count) +"]: ");
  System.out.println(x.toUpperCase());
  return x.toUpperCase();
 }
}