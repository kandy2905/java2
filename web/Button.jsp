<%-- 
    Document   : Button
    Created on : Apr 21, 2017, 1:58:05 PM
    Author     : Administrator
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <center>
<style>
#a1{
background-color:
#FF99CC;
color:
#3333CC;
border:medium thick #FF3399;
font-family:Georgia, "Times New Roman", Times, serif bold;



}
h1 {background-color:#CCCCCC;}
li {background-color:#CCCCCC; 
font-size:18px;
border-width:medium;
font-family:Georgia, "Times New Roman", Times, serif;
text-shadow:inherit;color:#3333CC;}
br {background-color:#CC6699;}

</style>



<body>
<h1><ul>Login</ul></h1>

<html>
<body>
	<form name="" onsubmit="f()">
	
	
	

		<script>
		function f(){

//VARIABLE DELCARE

			var v=document.getElementById("nam").value;
			var pat5=/^[a-zA-Z]/;
			

//passwrd var
			var v1=document.getElementById("pw").value;
			var v2=document.getElementById("pw1").value;
			
			var pat2=/^[0-9a-zA-Z]/;



//VALIDATION
			if(v=="") {
				alert("Please Enter Your Name");
				document.getElementById("nam").focus();
				return false;
			}

			else if(pat5.test(v)==false){
				alert("Name should be text");
				document.getElementById("nam").focus();
				return false;
			}

//pw validation
			else if(v1==""){
				alert("please enter strong password");
				document.getElementById("pw").focus();
				return false;
			}
			
			else if(v2 =="" || v2!==v1){
				alert("Incorrect password");
				document.getElementById("pw1").focus();
				return false;				
			}


		</script>
                <li>
    <pre>
Username:       <input type="text" name="Username"><font color="red">*</font>
Password:       <input type="password" name="password"><font color="red">*</font><br>
    </pre>
	
<button><a href="index.jsp">Submit</a></button>
<br>
<button><a href="Registration.jsp">Registration</a></button>
<br><br><br></li>
<b>Note:</b>* means must required
</body>
</html>
</body>
</center>

    </head>
    
</html>
