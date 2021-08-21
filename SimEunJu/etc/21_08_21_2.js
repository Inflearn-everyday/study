// ㅇㄷㅈ 2

function solution(code) {
    const stack = [{ depth : -1 }];
    const res = [];
    
    for(let i=0; i<code.length; i++){
    
        const command = code[i];
        
        const depth = command.lastIndexOf(".");
        
        if(depth > stack[stack.length-1].depth) stack.push({ depth });
        while(depth < stack[stack.length-1].depth){
            stack.pop();
        }
        //console.log(stack)
        
        const statement = command.substring(depth+1, command.length);
        if(statement.startsWith("print")){
            const [, variable] = statement.split(" ");
            const lastBlock = stack[stack.length-1];
            let value = null;
            for(let i=stack.length-1; i>=0; i--){
                if(stack[i][variable]){
                    value = stack[i][variable];
                    break;
                } 
            }
           
            if(value) res.push(`${variable}=${value}`);
            else res.push("error");
        }
        else{
            const [variable, value] = statement.split("=");
            const lastBlock = stack[stack.length-1];
            lastBlock[variable] = value;
        }
    }
    return res;
}
