function sleepA(num) {
    setTimeout(()=>{
        console.log(num)
    }, Math.random() * 1000);
}

function sleepB(num) {
    return new Promise(resolve => {
        setTimeout(() => {
            console.log(num);
            resolve();
        }, Math.random() * 1000)
    })
}

function count() {
    console.log("start.");
    for (num = 1; num <= 10; num++) {
        sleepA(num);
    }
    console.log("end.");
}

async function asyncCount() {
    console.log("start.");
    for (num = 1; num <= 10; num++) {
        await sleepB(num)
    }
    console.log("end.");
}

count();
asyncCount();

