// ㄱㄹ 1
function solution(infos, actions) {
    const order = new Order();
    const auth = new Auth(infos);
    const res = [];
    for(let i=0; i<actions.length; i++){
        const action = actions[i].split(" ");
        switch(action[0]){
            case "ADD":
                if(!auth.isLogin()) res.push(false);
                else {
                    order.addBasket(action[1]);
                    res.push(true);
                }
                break;
            case "LOGIN":
                const availLogin = !auth.isLogin() && auth.login({ name: action[1], password: action[2] });
                if(availLogin) res.push(true);
                else res.push(false);
                break;
            case "ORDER":
                if(order.isBasketEmpty()) res.push(false);
                else {
                    order.orderBasket();
                    res.push(true);
                }
                break;
        }
    }
    return res;
}

class Auth{
    constructor(infos){
        this._isLogin = false;
        this._infos = infos.reduce((acc, info) => {
            const auth = info.split(" ");
            acc[auth[0]] = auth[1];
            return acc;
        }, {});
        
    }
    
    login({name, password}){
        
        if(this._infos[name] && this._infos[name] === password){
            this._isLogin = true;
            return true;
        } 
        return false;
    }
    
    isLogin(){
        return this._isLogin;
    }
    
}

class Order{
    constructor(){
        this._basket = [];
    }
    addBasket(food){
        this._basket.push(food);
    }
    isBasketEmpty(){
        return this._basket.length === 0;
    }
    orderBasket(){
        this._basket = [];
    }
}
