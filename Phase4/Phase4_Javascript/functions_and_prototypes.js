// function constructor 
function Employee(name, designation, yearOfBirth){   
    this.name= name; 
    this.designation= designation; 
    this.yearOfBirth= yearOfBirth; 
} 

const d = new Date();
let year = d.getFullYear();
console.log(year);

// creating calculateAge() method to the Prototype property 
Employee.prototype.calculateAge= function(){  
    console.log('The current age is: '+(year- this.yearOfBirth)); 
} 
console.log(Employee.prototype); 
  

// creating Objects
let Emp1= new Employee('Alex', 'Junior Tester', 1995);  
console.log(Emp1) ;
Emp1.calculateAge(); 

let Emp2= new Employee('Dexter', 'Senior Software Developer', 1990); 
console.log(Emp2) 
Emp2.calculateAge();

let Emp3= new Employee('Annie', 'Junior HR', 1998); 
console.log(Emp3) 
Emp3.calculateAge();

let Emp4= new Employee('Annu', 'Junior Developer', 2001); 
console.log(Emp4) 
Emp4.calculateAge();


