

// ### **Module 12 - Asynchronous & API Handling:**

// 1. setInterval & setTimeout ✔️
// 2. clearInterval & clearTimeout ✔️
// 3. Main Stack & Side Stack & event loop
// 4. Creating Promises
// 5. Then, Catch, Finally, Async, Await
// 6. Promise.all
// 7. Promise.race
//  8 . Promse.any 
//  AJAX
//  JSON
//  `JSON.parse()` and `JSON.stringify()`
//  API (Application Programming Interface)
//  Fetch API (using `.then-catch` and `async-await`)
//  Axios library (difference from Fetch)
//  API endpoints and routes
//  Displaying data with HTML
//  Query strings

// *   Module 13 - Error Handling & File Management:
// *   1. Try-Catch 
// *   2. Custom Error Handling (Using extend Error Class)
// *   3. Require & Export
// *   4. Default Import/Export
// *   5. Named Import/Export
// *   6. Taking Input in JS with Node



// let pros = new Promise((res ,rej)=>{

// setInterval(()=>{
//     // res("hrlo")
//     rej("your  passo is wroung ")

// }, 2000)

// })

//  pros
//  .then((data)=>console.log(data))
//  .catch((error)=>console.log(error))
//  .finally(()=>console.log("always"))


// async function Async2(){

// try {
    
//     let res = await  pros;
// console.log(res)
// } catch (error) {
//     console.log(error)
// }

// } 

// Async2();


// 6. Promise.all ( AND -- if every  promise is resolve , then only the )
// 7. Promise.race
//  8 . Promse.any 


// let p1 = new Promise((res,rej) => setTimeout(()=> rej("this is promise 1 "),100))
// let p2 = new Promise((resolve,rej) => setTimeout(() => rej('Promise 2 resolved'), 100));
// let p3 = new Promise((resolve ,rej) => setTimeout(() => rej('Promise 3 resolved'), 20));

// A * B -- 

// Promise.all([p1 ,p2 ,p3])
// .then((data)=>{

//     console.log(data)

// })
// .catch(()=>{})



//  Promise.race 

// Promise.race([p1 ,p2 ,p3])
// .then((data)=>{

//     console.log(data)

// })
// .catch((er)=>{})

    //  8 . Promise.any 


//     Promise.any([p1 ,p2 ,p3])
// .then((data)=>{

//     console.log(data)

// })
// .catch((er)=>{console.log(er.errors)})

// let promise1 = new Promise((resolve ,rej ) => setTimeout(() => rej('Promise 1 resolved'), 1000));
// let promise2 = new Promise((resolve,rej) => setTimeout(() => rej('Promise 2 resolved'), 500));
// let promise3 = new Promise((resolve ,rej) => setTimeout(() => resolve('Promise 3 resolved'), 500));

// Promise.any([promise1, promise2, promise3])
//   .then((value) => {
//     console.log(value); // "Promise 2 resolved" (whichever resolves first)
//   })
//   .catch((error) => {
//     console.log(error); // Only if all promises are rejected
//   });


// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// !!!! API 

//  AJAX --
//  JSON
//  Creating elements with HTML
//  Adding class, attribute, and ID to HTML elements
//  `JSON.parse()` and `JSON.stringify()`


//  HTTP Status Codes (200, 201, 401, 403, 404, 502, 503)

//  API (Application Programming Interface)
//  Fetch API (using `.then-catch` and `async-await`)
//  Fake Store API, Fake User API
//  Axios library (difference from Fetch)
 
//  API endpoints and routes


//  Displaying data with HTML
//  HTTP headers
//  GET and POST methods
//  Query strings  // --








// const promiseFive = new Promise(function(res,rej){
//     setTimeout(function(){
//                 let noerror = true
//                 if(noerror){
//                     res({
//                         username:"javascript" , passo:"123"
//                     })
//                 }
//                 else {
//                     rej("something went wrong")
//                 }
//             },1000)
// })



// async function  consumedpromiseFive(){
//     try{
//        const response =  await promiseFive ;  

//     console.log(response)
//     } catch(err){ 
//        console.log(err)
//     }
//    }

//    consumedpromiseFive();
   
   
   
   
//    async function getallUsers(){
//      try{
//        let res = await fetch('https://randomuser.me/api')
   
//        const data  = await res.json() ; // json me convert karne me time lagta hai  , readable format me 
//        console.log(res);
//      }catch(err){
//        console.log(err);
//      }
//    }
   
//    getallUsers() 
// console.log(process.argv);

const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('What is your name? ', (answer) => {
    console.log(`Hello, ${answer}!`);


    rl.question('What is your Age? ', (age) => {
        console.log(`Hello, ${age}!`);
    
        rl.close();
    });

});


