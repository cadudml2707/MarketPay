import { Route, Routes } from "react-router-dom";
import { Login } from "./pages/login";
import { Venda } from "./pages/venda";
import { Produtos } from "./pages/produtos";
import { Users } from "./pages/users";
import { Clientes } from "./pages/clientes";

export function AppRoutes(){
    return(
        <Routes>
            <Route path="/" element={<Login/>} />
            <Route path="/venda" element={<Venda/>}/>
            <Route path="/produtos" element={<Produtos/>}/>
            <Route path="/users" element={<Users/>}/>
            <Route path="/clientes" element={<Clientes/>}/>
        </Routes>
    );
}