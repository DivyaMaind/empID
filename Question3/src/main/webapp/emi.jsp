<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.lang.Math" %>

<%
    double principal = Double.parseDouble(request.getParameter("principal"));
    double interest = Double.parseDouble(request.getParameter("interest"));
    double time = Double.parseDouble(request.getParameter("time"));

    double rateOfInterest = interest / 100;
    double monthlyInterest = rateOfInterest / 12;
    double emi = (principal * monthlyInterest * Math.pow(1 + monthlyInterest, time)) / (Math.pow(1 + monthlyInterest, time) - 1);
    double totalAmount = emi * time;

    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    String emiFormatted = decimalFormat.format(emi);
    String totalAmountFormatted = decimalFormat.format(totalAmount);
%>

<!DOCTYPE html>
<html>
<head>
    <title>EMI Calculator Result</title>
</head>
<body>
    <h1>EMI Calculator Result</h1>
    <p><strong>Total Amount:</strong> <%= totalAmountFormatted %></p>
    <p><strong>EMI per Month:</strong> <%= emiFormatted %></p>
</body>
</html>

</body>
</html>