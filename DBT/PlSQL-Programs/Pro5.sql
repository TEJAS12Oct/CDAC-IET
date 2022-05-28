drop PROCEDURE if EXISTS Insert_login;
delimiter $
CREATE PROCEDURE Insert_login(in id int , para_userName varchar(20) ,in para_password varchar(20) , in email varchar(20))

begin
if length(email)=12 and email  like '%@gmail.com' THEN
  
  insert into loginP1 values(id,para_userName,para_password,email);
   select "INSERTED";
ELSE
    if email not like '%@gmail.com' THEN
      select "Please Enter In Format @gmail.com";
    else 
       select "Length should be under 12";
    end if;
end if;
end $
delimiter ;