function name(params) {
    console.log(params)
}

name("azeez");


function name(params) {
    console.log(params)
}

function higherOderFunction(){
    console.log('I am higher fundton')

    function lowerFunction(){
        console.log("I am inner functio")
    }
    console.log("I am inner function")
   return lowerFunction
}

const print = (param) =>{
    console.log(params);
    console.log("I am inner function");
    const lowerFunction = () => {
        console.log("I am inner function");
        const name = () => {
            console.log("I am innerInner function");
            name("pass-in something here");
        }
        name("pass-in somethoing here")
        }
        lowerFunction();

    }
    print("ugo")

}
function as an argument can also be called call back function
function firstfunction(){
console.log("first function");
}
function secondFunction(callback{
    console.log("second function");
    callBack();
}
secondFunction(fisrtFunction);