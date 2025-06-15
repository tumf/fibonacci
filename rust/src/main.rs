use std::env;
use fibonacci::fibonacci;

fn main() {
    let args: Vec<String> = env::args().collect();
    if args.len() != 2 {
        eprintln!("Usage: cargo run -- <n>");
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
        None => println!("Invalid input: n must be >= 0 and <= 92"),
    }
}