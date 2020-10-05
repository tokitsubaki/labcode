function main() {
    try {
        console.log("before exception.");
        throwTestException();
        console.log("after exception.");
    } catch (error) {
        console.error(error.stack);
    } finally {
        console.log("finally.");
    }
}

function throwTestException() {
    console.log("before throw.");
    throw Error("test error.");
    console.log("after throw.");
}

main();