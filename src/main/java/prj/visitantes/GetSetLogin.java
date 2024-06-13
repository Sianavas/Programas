/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj.visitantes;

/**
 *
 * @author Alexios
 */
public class GetSetLogin {
    private String UserLogin;
    private String Upasswd; 
    private String TipoUsuario;
    
    public void setTipo(String TpUsuario){
        TipoUsuario = TpUsuario;
        if (TipoUsuario == "Administrador"){
            UserLogin ="Vitor";
            Upasswd = "123"; }
        else{
            UserLogin ="Carlos";
            Upasswd = "456"; }
        }
        
    public String getLogin(){
        return UserLogin;
        }
    public String getPasswd(){
        return Upasswd;
        }
}
