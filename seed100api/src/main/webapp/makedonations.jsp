<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%-- <%@ include file="/WEB-INF/includes.jsp"%> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>SEED100</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<script type="text/javascript" src="js/jquery-1.6.js"></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-replace.js"></script>
<script type="text/javascript" src="js/Vegur_700.font.js"></script>
<script type="text/javascript" src="js/Vegur_400.font.js"></script>
<script type="text/javascript" src="js/Vegur_300.font.js"></script>
<script type="text/javascript" src="js/atooltip.jquery.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="js/html5.js"></script>
<style type="text/css">.box1 figure{behavior:url("js/PIE.htc");}</style>
<![endif]-->
</head>
<body id="page2">
	<div class="body1">
		<div class="main">
			<!-- header -->
			<header>
			<div class="wrapper">
				<h1>
					<a href="index.html" id="logo">SEED100</a>
				</h1>
				<nav>
				<ul id="top_nav">
					<li><a href="index.jsp"><img src="images/top_icon1.gif"
							alt=""></a></li>
					<li class="end"><a href="contact.jsp"><img
							src="images/top_icon3.gif" alt=""></a></li>
				</ul>
				</nav>
				<nav>
				<ul id="menu">
					<li><a href="index.jsp">Home</a></li>
					<li ><a href="mission.jsp">Our Mission</a></li>
					<li><a href="contact.jsp">Contact Us</a></li>
					<li><a href="gallery.jsp">Gallery</a></li>
					<li id="menu_active"><a href="makedonations.jsp">Donate</a></li>
				</ul>
				</nav>
			</div>
			</header>
			<!-- / header -->
			<!-- content -->
			<article id="content">
			<div class="wrapper">
				<div class="our_mission">
					<div class="line1">
						<%-- <form:form action="makedonations.do" method="POST"
							commandName="makedonations">
							<ul>
								<li><label for="username">*Name:</label></li>
								<li><input type="text" name="username" size="50" /></li>

								<li><label for="email">*Email:</label></li>
								<li><input type="text" name="email" size="50" /></li>

								<li><label for="phone">Phone:</label></li>
								<li><input type="text" name="phone" size="50" /></li>

								<li><label for="amount">*Amount:</label></li>
								<li><input type="text" name="amount" size="50" /></li>


								<li><input type="submit" name="submit" class="submit-style"
									value="Submit" /></li>
							</ul>
						</form:form> --%>
						
						<form>
						<p>Sorry! This is page is not available.
							</p>
						</form>

					</div>
				</div>
				<div class="wrapper">
					<div class="wrapper">
						<h3>Our Mission</h3>
						<p class="quot">
							Seed100 is a registered charitable trust which supports the education of girl children in India.
Seed100 works with a simple but powerful concept - every member contributes 100 bucks minimum every month to support the vision of Seed100 
which is to help educate girl children who can't afford it themselves.<img src="images/quot2.png"
								alt="">
						</p>
					</div>
					
				</div>
				
			</article>
			<!-- / content -->
			<!-- footer -->
			<footer>
      <div class="wrapper"> <a href="index.jsp" id="footer_logo"><span>SEED</span>100</a>
        <ul id="icons">
          <li><a href="https://www.facebook.com/SEED100" class="normaltip"><img src="images/icon1.gif" alt=""></a></li>
          <li><a href="https://twitter.com/SEED100_sowLOVE" class="normaltip"><img src="images/icon2.gif" alt=""></a></li>
          <li><a href="https://www.instagram.com/seed100_sowlove" class="normaltip"><img src="images/icon3.gif" alt=""></a></li>
        </ul>
      </div>
      <div class="wrapper">
        <nav>
          <ul id="footer_menu">
            <li class="active">
           
            <div class="tel"><span>+91 893</span>917 96 78</div>
      
            
          </ul>
        </nav>
        </div>
      <div id="footer_text">Copyright &copy; <a href="index.jsp">SEED100</a> All Rights Reserved<br>
       </a></div>
    </footer>
			<!-- / footer -->
		</div>
	</div>
	<script type="text/javascript">
		Cufon.now();
	</script>
</body>
</html>