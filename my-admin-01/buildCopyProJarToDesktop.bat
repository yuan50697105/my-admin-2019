@echo off
call mvn clean package -P prod -B -T 4
call mkdir %USERPROFILE%\desktop\maven 
call mkdir %USERPROFILE%\desktop\maven\exe 
for /r . %%i in (*dev.jar) do call xcopy /q /a %%i %USERPROFILE%\desktop\maven\exe /y
call mvn clean