<%@page import="com.sampleapi.exception.FetcherBaseException"%>
<%@ page import='java.util.List'%>
<html>

<head>
	<h2>Welcome to the Online Weather Forecast!</h2>
</head>
<body>


	<form name="cities" id="cities" action="fetchcityinfo">
		<select id="cityList" name="cityList">
			<option value="Bangalore">Bangalore</option>
			<option value="Kolkata">Kolkata</option>
			<option value="Delhi">Delhi</option>
			<option value="Mumbai">Mumbai</option>
			<option value="Chennai">Chennai</option>
			<option value="Chandigarh">Chandigarh</option>
			<option value="Bhopal">Bhopal</option>
			<option value="Bangkok">Bangkok</option>
			<option value="Tokyo">Tokyo</option>
			<option value="Seoul">Seoul</option>
			<option value="Beijing">Beijing</option>
			<option value="Shanghai">Shanghai</option>
			<option value="Manila">Manila</option>
			<option value="Karachi">Karachi</option>
			<option value="Portblair">Portblair</option>
			<option value="Hyderabad">Hyderabad</option>
			<option value="Kathmandu">Kathmandu</option>
			<option value="Dhaka">Dhaka</option>
			<option value="Colombo">Colombo</option>
		</select>
		 <input type="Submit" name="city" id="get_details" value="Get Details">
	</form>
	<h3>City Info Is : <br><br></h3>
	
	
	<% 	
		String wtr="";
		List<String> nws=null;
		
		
		wtr = (String) request.getAttribute("wthr");
 		nws = (List<String>) request.getAttribute("news");
			
		
		try{%>
	
		<%=wtr %><br><br>
		<%}catch(Exception e){
			%><h3><font color="Red">Exception occured in reading the Weather</font></h3><%
			System.out.println("Exception Occured in Weather : "+e.getMessage());
		}
		try{
		for(String s : nws){
			%><br><br>
			<%=s %>
			<% 
		}
		}
		catch(Exception e){
			%><h3><font color="Red">Exception occured in reading the News</font></h3><%
			System.out.println("Exception Occured in News : "+e.getMessage());
		}
	%>

	<%-- <i><br><br>Filter News :<input type="text" id="cityFilter"></i>
	<button type="Submit">Filter Now</button>
	<p>Selected City Is :</p>
	<%=request.getAttribute("cityList") %> --%>

	</body>
</html>
