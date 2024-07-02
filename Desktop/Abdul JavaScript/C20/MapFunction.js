const listOfNumber = [[2,3,4,5,1],[1,2],[2,3,4,5]];
//const human = {
   // "first name ": "chinedu",
   // "lastName" : "ugo",
//}

//let result = listOfNumber.map((detail) => {
   // return detail * 2
//})



let answer = listOfNumber.findIndex((number)=> {
    
    return number > 2 

})
console.log(answer)
