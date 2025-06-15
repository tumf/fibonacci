use fibonacci::fibonacci;
use std::env;

fn main() {
    let args: Vec<String> = env::args().collect();
    if args.len() != 2 {
        eprintln!("Usage: {} <n>", args[0]);
        std::process::exit(1);
    }
    let n: i32 = match args[1].parse() {
        Ok(num) => num,
        Err(_) => {
            eprintln!("Invalid input: must be an integer");
            std::process::exit(1);
        }
    };
    match fibonacci(n) {
        Some(result) => println!("{}", result),
        None => {
            eprintln!("Input must be in the range 0..=92");
            std::process::exit(1);
        }
    }
}