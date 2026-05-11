import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionClass {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Wrestler wrestler = new Wrestler("Roman Reigns", "Spear");
        System.out.println(wrestler.getName() + " " + wrestler.getFinisher());


        //when we try to change name
        wrestler.setFinisher("Superman Punch");
        System.out.println(wrestler.getName() + " " + wrestler.getFinisher());


        //change final
        Field[] declaredFields = wrestler.getClass().getDeclaredFields();
        System.out.println("\n\nDeclared Fields name");
        for(Field field : declaredFields){
            System.out.println(field.getName());
        }


        //change final field via refelection class
        System.out.println("\n\nChanging Wrestler name");
        for(Field field : declaredFields){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(wrestler, "Kevin Owens");
            }
        }
        System.out.println(wrestler.getName() + " " + wrestler.getFinisher());


        //Declared Method
        System.out.println("\n\nDeclared Methods");
        Method[] declaredMethods = wrestler.getClass().getDeclaredMethods();
        for(Method method :  declaredMethods){
            System.out.println(method.getName());
        }


        //invoke method
        System.out.println("\n\nInvoking methods");
        for(Method method : declaredMethods){
            if(method.getName().equals("stamina")){
                method.invoke(wrestler); //put object of the class
            }

            if(method.getName().equals("championshipWins")){
                method.invoke(wrestler, 7);//if parameter, pass it or else leave it
            }

            //access private method as well
            if(method.getName().equals("privateMethodForSalary")){
                method.setAccessible(true);
                method.invoke(wrestler);
            }

            //for static no need to pass object
            if(method.getName().equals("entrance")){
                method.setAccessible(true); //not needed for public function
                method.invoke(null);
            }
        }


    }
}
