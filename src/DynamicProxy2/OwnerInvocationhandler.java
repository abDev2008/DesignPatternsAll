package DynamicProxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationhandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
       try{
           if(method.getName().equals("getName")){
               return method.invoke(proxy,args);
           }
       }catch (InvocationTargetException e){
           e.printStackTrace();
       }
       return null;
    }
}
