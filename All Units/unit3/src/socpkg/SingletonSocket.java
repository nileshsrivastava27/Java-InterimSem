package socpkg;

public class SingletonSocket {
    private static SingletonSocket socket = null;
    public int socID = 0;

    private SingletonSocket(){
        this.socID = 1024;
    }

    public static SingletonSocket allocateSocket(){
        if(socket==null)
            socket=new SingletonSocket();
        return socket;
    }

    public void displaySocket(){
        System.out.println("Socket number: " +socID);
    }
}

