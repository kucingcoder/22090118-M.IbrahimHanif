package com.project.Model;

public class database {
    final private String host, port, user, pass, dbname;
    
    public database(String server, String port_number, String username, String password, String database_name){
       host   = server;
       port   = port_number;
       user   = username;
       pass   = password;
       dbname = database_name;
    }

    public String getHost()   { return this.host;   }

    public String getPort()   { return this.port;   }

    public String getUser()   { return this.user;   }

    public String getPass()   { return this.pass;   }

    public String getDbname() { return this.dbname; }
}
