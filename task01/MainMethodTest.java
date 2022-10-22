package task01;

//模拟一个系统，假设这个系统要使用必须输入用户名和密码
public class MainMethodTest {

    //用户名和密码输入到这个参数中
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("please enter 2 parametres: username and password");
            return;
        }
        //get username and password
        String username = args[0];
        String pwd = args[1];
        if("admin".equals(username) && "123".equals(pwd)){
            System.out.println("login successfully, welcome to use the system");
        }else{
            System.out.println("username or password is not correct");
        }


    }
}
