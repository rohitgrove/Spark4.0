// function insode method(ES5)
var obj = {
    parent : function () {
        function child() {
            console.log(this);
        }
        child();
    }
}

obj.parent();

// function insode method(ES6)

var obj = {
    name : function () {
        var child = () => {
            console.log(this);
        }
        child();
    }
}

obj.name();