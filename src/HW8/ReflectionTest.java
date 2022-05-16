/**
 * @author Matthew Scully
 * @version 1.0
 * @since 5-14-22
 * 
 * ReflectionTest class
 * 
 * <p>
 * This class uses the reflection libraries in order to retrieve methods and their parameter types for the two classes, Person.java and Address.java 
 * found in CS151HW2.
 * </p>
 * 
 * 
 */

package HW8;
import java.lang.reflect.*;

public class ReflectionTest {

    public static void main(String[] args) {
            

            Method[] knownMethods =  Person.class.getDeclaredMethods();
            
            System.out.println("Person Class");
            System.out.println();
 
            
            
            //create loop to loop through known methods made and display params
            for (int i=0 ; i<knownMethods.length; i++) {

            	
            	System.out.printf(knownMethods[i].getName()+ " Parameters: " + knownMethods[i].getParameterCount());

         	//get types of params
            	
            Class[] parameters=knownMethods[i].getParameterTypes();
            
            	if(parameters.length>0) {
            			System.out.printf(" Type:");
            	}
            	
            //loop for displaying params
            
            for(Class parameter : parameters)
            	
            	{
                    System.out.print(" "+parameter.getSimpleName());
            	}
            
            System.out.print("\n");
        
            }
            
            Method[] declaredMethodAddress =Address.class.getDeclaredMethods();
            
            System.out.println();
            System.out.println("Address Class");
           
            
            for (int i=0 ;i<declaredMethodAddress.length ; i++) {
        
                    System.out.printf(declaredMethodAddress[i].getName() + " Parameters: " + knownMethods[i].getParameterCount());
                    
                    Class[] parameters=declaredMethodAddress[i].getParameterTypes();
                    
                    if(parameters.length>0) {
                    	System.out.printf("   Type:");
                    }
                    
                    for(Class parameter : parameters)
                    {
                    System.out.print(" "+parameter.getSimpleName());
                    }
            
            System.out.print("\n");
        
            }
            
            
            //accessing fields of class
            Field[] fields = Address.class.getDeclaredFields();
            
            System.out.println();
            System.out.println("Address Class Fields");
            
            for (Field field  :fields) {
                 System.out.println(field.getName() + " " +field.getAnnotatedType().getType().getTypeName() +" "+ Modifier.toString(field.getModifiers()));
    
            }
    
           //make sure to put in try catch for error catching
            			try {
                     	//create object for ref
                            Class person = Class.forName("HW8.Person");
                            Class Address = Class.forName("HW8.Address");
                            
                            Person person1 =new Person();
                            Person person2 =new Person();
                            Person person3 =new Person();
                   
                        //declaring methods to invoke
                            Method setFirstName = person.getDeclaredMethod("setFirstName", String.class);
                            Method setLastName = person.getDeclaredMethod("setLastName", String.class);
                            Method setAge = person.getDeclaredMethod("setAge", int.class);
            
                        //invoking methods for test 
                            setFirstName.invoke(person1, "Matthew");
                            
                            setLastName.invoke(person1, "Scully");
                            
                            setAge.invoke(person1, 21);
                
                            setFirstName.invoke(person2, "Dhruv");
                            
                            setLastName.invoke(person2, "Khaul");
                            
                            setAge.invoke(person2, 20);
                       
                            setFirstName.invoke(person3, "Clayton");
                            
                            setLastName.invoke(person3, "Harris");
                            
                            setAge.invoke(person3, 18);
                            
        
                         Method getFirstName =person.getDeclaredMethod("getFirstName");
                         Method getAge =person.getDeclaredMethod("getAge");
                         
                         System.out.println("\n"+"List of Objects Declared:" + "\n");
                         
                         System.out.println(""+getFirstName.invoke(person1));
                         System.out.println(""+getAge.invoke(person1));
                         
                         System.out.println(""+getFirstName.invoke(person2));
                         System.out.println(""+getAge.invoke(person2));
                         
                         System.out.println(""+getFirstName.invoke(person3));
                         System.out.println(""+getAge.invoke(person3));
                         
                         
                    }
            			
            //catching exceptions
            catch (ClassNotFoundException|NoSuchMethodException|SecurityException E) {
            				
            	E.printStackTrace();       
                    } catch (IllegalAccessException E) {
                    	
                        E.printStackTrace();
                            
                    } catch (IllegalArgumentException E) {
                            
                    	E.printStackTrace();
                    	
                    } catch (InvocationTargetException E) {
                        
                    	E.printStackTrace();
                    	
                    }
            			
            			
            			
    }

}