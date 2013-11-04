package tp.example.itf;

import tp.example.server.RMIServer;

public class Test {

 /**
  * @param args
  */

 static public void main(String args[]) {
   try {
    System.out.println("Mise en place du Security Manager ...");
    System.setSecurityManager(new java.rmi.RMISecurityManager());
    new RMIServer();
   } catch (Exception e) {
    e.printStackTrace();
    System.exit(1);
   }
  }


}