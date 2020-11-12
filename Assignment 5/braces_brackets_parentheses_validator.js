var openers = ['(', '{', '['];
var closers = [')', '}', ']'];
function braces_brackets_parentheses_validator(code) {
    var stack = [];
    for(var i in code){
        index = openers.indexOf(code[i]);
        if(index >= 0){
            
            stack.push(code[i]);
        }else{
            index = closers.indexOf(code[i]);
            if(index >= 0){
                if(stack[stack.length-1] != openers[index]){
                    console.log('opener:"'+stack[stack.length -1]+'" unexpected closer:"'+closers[index]+'" at index:'+i);
                    return false;
                }
               
                stack.pop();
            }
        }
    }
        
    return true;
}

// test cases 

console.log(braces_brackets_parentheses_validator('{ [ ] ( ) }'));
console.log(braces_brackets_parentheses_validator('{ [ ( ] ) }'));
console.log(braces_brackets_parentheses_validator('{ [ }'));