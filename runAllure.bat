set ProjectPath=%~dp0
cd %ProjectPath%
set p=%PATH%
java -javaagent:"%ProjectPath%libAllure\aspectjweaver-1.8.10.jar" -classpath "%ProjectPath%bin;%ProjectPath%libAllure\*;%ProjectPath%libAllure\*;%ProjectPath%libExtentV4\*;%ProjectPath%libLog\*;%ProjectPath%libReportNG\*;%ProjectPath%libWebDriverManager\*" org.testng.TestNG "%ProjectPath%bin\runUserTestcases.xml"
pause