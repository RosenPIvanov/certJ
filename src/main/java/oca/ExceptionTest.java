package oca;


import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
}


class PortConnector{    public PortConnector(int port) throws IOException{

}    }


class CleanConnector extends PortConnector {
public CleanConnector(int port) throws Exception
{super(port);
}

    public CleanConnector(String port) throws IOException, FileNotFoundException
    {super(Integer.parseInt(port));
    }
}