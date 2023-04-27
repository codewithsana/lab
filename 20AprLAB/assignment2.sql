use 4119db;
create table employee(
employee_id integer(6),
last_name varchar(25),
job_id varchar(10),
salary double(8,2),
comm_pct double(4,2),
mgr_id integer(6),
dept_no integer(4));
insert into employee values
(198,'connell','SH_CLERK',2600,2.5,124,50),
(199,'grant','SH_CLERK',2600,2.2,124,50),
(200,'whalen','AD_ASST',4400,1.3,101,10),
(201,'hartstein','IT_PROG',6000,null,100,20),
(202,'fay','AC_MGR',6500,null,210,20),
(203,'mavris','AD_VP',7500,null,101,40),
(204,'baer','AD_PRES',3500,1.5,101,90),
(205,'higgins','AC_MGR',2300,null,101,60),
(206,'gitz','IT_PROG',5000,null,103,60),
(100,'king','AD_ASST',8956,0.3,108,100),
(101,'kochar','SH_CLERK',3400,1.3,118,30);
# display the emp_id,last_name and job_id
select employee_id,last_name,job_id from employee;
#display the details of all employee of department 60
select * from employee where dept_no=60;
#display the details of employee name king
select* from employee where last_name='king';
# display the job id
select job_id from employee ;
# job_id as job_title
select job_id as 'job_title' from employee;
#display the salary increament with 300
select last_name,salary,salary + 300 as 'increased_salary' from employee;
# display the annual compensation of all employee
select last_name,salary ,mgr_id,mgr_id +100 as 'annual_comp' from employee;
#display the commision of employee null or not null
select comm_pct from employee where comm_pct is not null ;
select comm_pct from employee where comm_pct is  null ;
# display the salary is greater than 5000
select employee_id,dept_no,salary from employee where salary>5000;
#display salary between 4000 and 7000
select last_name,salary from employee where salary between 4000 and 7000;
select* from employee where salary between 6000 and 7500;
select * from employee where dept_no between 10 and 50;
select * from employee where salary != 5000;





