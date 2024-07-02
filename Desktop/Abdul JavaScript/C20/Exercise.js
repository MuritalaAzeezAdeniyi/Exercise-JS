function scores_above_70(arrayOfScores){   

let answer = arrayOfScores.filter((number) => {
    return number >= 70 ;
})
return answer;
}
const listOfNumber = [85, 92, 78, 88, 95]
console.log(scores_above_70(listOfNumber))

function multiply_socres(arrayofscores){
let result = listOfNumber.map((detail) => {
     return detail * 5
})
 return result;
}
console.log(result= [90,40,77,80,88,100,23,70,75,82]);

function squareofNumber(arrayOfNumbers){ const squareOfNumber = [2, 4, 6, 8, 10]
let square = squareOfNumber.map((index)  =>{
    return index **2
})
return square
}
console.log(square);

 const listOfMember = ["Emily", "Jack", "Sophia", "Daniel"]
 let collection = ["Emily", "Jack", "Sophia", "Daniel"]
 for(index = 0; index < listOfMember.length;index++){
    collection[index] = listOfMember[index]
 }
console.log(collection)

  const timing = ["9:00 AM", "11:00 AM", "1:00 PM", "3:00 PM","5:00 PM"]

  let schdule = timing.filter((time) => {
    return time.slice(-2) === pm
  })
console.log(schdule)

const expenses = { "groceries": 150, "dining out": 100, "transportation": 50, "entertainment": 80 } 

let totalAmount 
for( category in expenses ){
 totalAmount += expenses[category];
}

console.log(`The totalAmount of category : $ {totalAmount}`)



let obj = {}
const member = ["Emily", "Jack", "Sophia", "Daniel"];
const books = ["maths","English","physics","chemistry"]
let distribution 
for(distribution of member){
    obj[distribution] = books[count++]
}

console.log(obj)
 

module.export = Exercise.js


