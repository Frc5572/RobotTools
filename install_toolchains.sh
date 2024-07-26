apt-get update
apt-get install -y build-essential curl g++-mingw-w64-x86-64
curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | bash -s -- -y
$HOME/.cargo/bin/rustup target add x86_64-pc-windows-gnu
