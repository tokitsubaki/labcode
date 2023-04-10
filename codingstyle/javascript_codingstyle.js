function myFuncArgsOption(hour, minute, opt_second = 0) {
    console.log(opt_second);
}

function myFuncArgsVars(hour, minute, var_args) {
    console.log(arguments[2]);
}

myFuncArgsOption(1,2);
myFuncArgsVars(1,2,3,4,5,6)
