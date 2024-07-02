function calculateArea(width,heigth){
 
heigth * width; 
console.log(width * heigth)
}
calculateArea(3 ,5);


function convertToFahrenheit(param){
let C = 10;
let F = C * 9/5 + 32;
return console.log(param);
}
convertToFahrenheit(457)


function isEven(number){    
    if(number % 2 == 0){
            return true
        }
        else{
            return false
        } 
    }
    console.log(isEven(5))


function isLeapYear(year){
if(year % 4 == 0 && year % 100 || year % 400){
  return  true; 
}
else{
    return false
} 
}
console.log(isLeapYear(2003));

function countVowels(StringAlphabet){
   count = 0
    word = "a,e,i,o,u"
 for(StringAlphabets in word){
    if(StringAlphabet[StringAlphabets] == "o"|| StringAlphabet[StringAlphabets] == "a" || StringAlphabet[StringAlphabets] == "i"|| StringAlphabet[StringAlphabets] == "u"|| StringAlphabet[StringAlphabets] == "e") {
        count++
 }
      
}
    return count;
}
console.log(countVowels(""))
