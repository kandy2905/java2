<%-- 
    Document   : Registration
    Created on : Apr 21, 2017, 2:03:03 PM
    Author     : Administrator
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <title>Registration Form</title>

<?php
	$tt1=$_POST['name'];
	$tt2=$_POST['cnum'];
	$tt3=$_POST['email'];
	
	
?>


<style>
#hello
{
position: absolute;
font-size: 35px;
color:#0000FF;
top: 25%;
left: 42%;
}
#frm
{
position: absolute;
left: 35%;
top: 33%;
padding: 15px;
}
</style>
<center><div id=hello>REGISTRATION FORM</div></center>
<div id=frm>
<form action="regration.jsp" method="post" name="f1">
<pre>
Username:       <input type="text" name="username"><br>
Password:       <input type="password" name="password"><font color="red">*</font><br>
ReEnter:        <input type="password" name="password1"><font color="red">*</font><br>
Contact Number: <input type="text" name="cnum"><br>
Email Address:  <input type="text" name="email"><font color="red">*</font><br>
Gender:         <input type=radio name="sex">Male <input type=radio name="sex">Female <br>
City:           <select><option>Scarborough</option><option>northyork</option><option>Eastyork</option></select>
                
	        <button><a href="Button.jsp">Submit</a></button>

<b>Note:</b>* means must required
</pre>
<br>
</form>

    </body>
</html>
