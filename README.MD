## LAB 6
Java Exception:<br/>
when there is a mistake in your app, it throws an exception, <b>BUT YOUR APP IS STILL RUNNING</b>
## Two types of exception:
1) checked Exception:<br/>
    IOException/JDBCException/etc
2) unchecked exception:<br/>
    ArrayOutOfBoundException

## Difference between errors & exception:
error is FATAL mistake, like out of memory error, which means JVM cannot solve the problem<br/>


## Your Exception
For this lab, you have to make your own exception. This IS different from using the exceptions of JDK.
Using the JDK default Exception is like:<br/><br/>
public ReturnType method_name() throws Exception{<br/>
    // your code<br/>
}
<br/><br/><b>OR</b><br/><br/>
public ReturnType method_name(){<br/>
    try{<br/>
        // your code<br/>
    }catch(Exception e){<br/>
        // ..<br/>
    }<br/>
}<br/>

But, for your own Exception, you should do something like the below:<br/><br/>
public ReturnType method_name(){<br/>
    try{<br/>
        // your code<br/>
        if(statement){throw new your_Exception(message);}<br/>
    }catch(Your_Exception e){<br/>
        // ..<br/>
    }<br/>
}<br/>
