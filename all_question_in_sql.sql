Q-2-> select count(first_name) from employees where department_id=80;

Q-3 ->  select max(salary) from employees where department_id=80;
Q-3-> select first_name from employees where salary=(select max(salary) from employees where department_id=80);
Q-4-> select first_name,max(salary) from employees where department_id=80 group by first_name;
Q-6-> select max(salary) - min(salary) as "max-min" from employees ;
Q-7->  select min(salary) from employees group by department_id having department_id=(select department_id from employees where first_name='Timothy');

Q-7-> select first_name, salary from employees where salary > 2900 and department_id=50;
Q-8->  select department_name from departments where department_id=(select department_id from employees where first_name='Donald'); 







