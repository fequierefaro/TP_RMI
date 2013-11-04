package tp.example.server;

import java.net.InetAddress;
import java.rmi.RemoteException;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import tp.example.itf.ReceiveMessageInterface;

public class RMIServer {
 int thisPort;
 String thisAddress;
 Registry registry; // rmi registry for lookup the remote objects.

 public RMIServer() throws RemoteException {
  ReceiveMessageInterface obj = new ReceiveMessageImpl();
  try {
   // get the address of this host (you may use 127.0.0.1 instead)
   thisAddress = (InetAddress.getLocalHost()).toString();
  } catch (Exception e) {
   throw new RemoteException("can't get inet address.");
  }
  thisPort = 3232; // this port(registry’s port)
  System.out.println("this address=" + thisAddress + ", port=" + thisPort);
  try {
   // create the registry and bind the name and object.
   registry = LocateRegistry.createRegistry(thisPort);
   registry.rebind("rmiServer", obj);
  } catch (RemoteException e) {
   throw e;
  }

    }

}