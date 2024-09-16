

// // !  call and apply methods



// // class and constructor
// // Methods inside and outside the constructor but inside the class
// // extends and super keyword








// //  this  , 

// // function sum(a , b){
// //     console.log(this);
// //     console.log(a+b);
// // }

// // let obj = {
// //     name:"xyz", 
// //     age : 23
// // }


// // sum.call(obj, 2,3);
// // sum.apply(obj, [2,3]);


// function SetUsername(username){
// this.username = username ;

// }
// function UserDetails(username , id , adress){
//     SetUsername.apply(this , [username]) 
//     this.id = id ;
//     this.adress = adress ;
// }

// let user1  = new UserDetails("nkdk", 2345 , "strionge /..")

// // console.log(user1)



// // class and constructor
// // Methods inside and outside the constructor but inside the class



// // extends and super keyword

// class User {

//  constructor(username , age , std){
// this.username = username ;
// this.age = age ;
// this.std = std ;
// this.getUsrname = ()=>{
//     console.log(this.username)
// }
//  }

// updateAge(){
//     this.age = this.age + 1
// }
// }


// let user = new  User("akshay" , 25, 2)
// let user3 = new  User("siddhant" , 53 , 12)
// let user4 = new  User("ayush" , 24 , 11)
// // console.log(user);
// // console.log(user4);
// // user.getUsrname()

// // user3.updateAge();
// // console.log(user3);


// // function Person(){
// //     this.canFly = false ;
// //     this.canTalk =true ;
// // }

// // function Teacher(name , age, salary){
// //     Person.call(this)
// //     // Person();
// //     this.name = name ;
// //     this.age = age ;
// //     this.salary = salary ;
// //     this.getTeacherInfo = ()=>{
// //         console.log(this.name, this.age, this.salary)
// //     }

// // }

// // let teacher1 = new Teacher("kiran", 34 , 3000)
// // console.log(teacher1)


// class Person{
//     constructor(name , age){
//         this.canFLy = false ;
//         this.canTalk = true ;
//         this.visibility = true
        
//     }

// changeVisibility (){
//         this.visibility = !this.visibility ;
//         console.log(this.visibility)
//       }
// }

// class Teacher extends Person {
//     constructor(name , age , salary){
//         super()
//         this.name = name ;
//         this.age = age ;
//         this.salary = salary ;
//     }
// }

// let teacher1 = new Teacher("kiran", 34 , 3000)
// // console.log(teacher1)
// let p1 = new Person()

// // // console.log(teacher1 === p1)
// // console.log(teacher1 instanceof Person)
// // console.log(p1 instanceof Teacher)

// // console.log(Object.getPrototypeOf(p1))
// // extends , super

// function Person() {
//     this.canFly = false;
//     this.canTalk = true;
//     this.visibility = true;
  
   
//   }
//   Person.prototype.changeVisibility = function() {
//     this.visibility = !this.visibility;
//     console.log(this.visibility);
//   };
  
//   function Teacher(name, age, salary) {
//     Person.call(this); // Call the Person constructor
//     this.name = name;
//     this.age = age;
//     this.salary = salary;
//   }
  

// Teacher.prototype.constructor = Teacher;
  
// let teacher1 = new Teacher("kiran", 34, 3000);
// let p1 = new Person();

