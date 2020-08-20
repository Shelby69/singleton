/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.paterns;

/**
 *
 * @author adagi
 */
public class BaseDeDatosSingleton {

    /**
     *
     * @return
     */
    public static BaseDeDatosSingleton getInstance() {
        return _instance;
    }

    public static void setInstance(BaseDeDatosSingleton aInstance) {
        _instance = aInstance;
    }
    private String url;
    private String user;
    private String password;
    private String nombreBD;
    private String port;
    private static BaseDeDatosSingleton _instance;
    //conexión bd

    private BaseDeDatosSingleton() {
        System.out.println("Conectando a la BD");
    }

    private BaseDeDatosSingleton(String url, String user, String password, String nombreBD) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.nombreBD = nombreBD;
    }

    /**
     *
     * @return
     */
    public static BaseDeDatosSingleton getIsntance() {
        if(_instance == null){
            _instance =new BaseDeDatosSingleton();
        }else{
            System.out.println("Ya fue instanciada");
        }
        return _instance;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreBD() {
        return nombreBD;
    }

    public void setNombreBD(String nombreBD) {
        this.nombreBD = nombreBD;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
    public void consultarClientes(){
        System.out.println("Id/Nombre/telefono");
        System.out.println("1/Jose/5522872089");
        System.out.println("2/Diana/5521309877");
        System.out.println(this);
    }

    public static class getIsntance extends BaseDeDatosSingleton {

        public getIsntance() {
        }
    }
}
