function User(username , age , std){
    this.username = username ;
    this.age = age ;
    this.std = std ;
    this.getUsrname = ()=>{
       console.log(this.username)
    }
}

User.prototype.updateAge = function(){
    this.age = this.age + 1
}   

let user = new  User("akshay" , 25, 2)
let user2 = new  User("siddhant" , 53 , 12)
let user3 = new  User("ayush" , 24 , 11)
console.log(user2)
console.log(user3)
user.getUsrname()

user.updateAge()
console.log(user)