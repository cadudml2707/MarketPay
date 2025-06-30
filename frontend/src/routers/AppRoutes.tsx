import { Route, Routes } from "react-router-dom";
import { Login } from "./pages/login";
import { Venda } from "./pages/venda";
import { Users } from "./pages/users"

export function AppRoutes(){
    return(
        <Routes>
            <Route path="/" element={<Login/>} />
            <Route path="/venda" element={<Venda/>}/>
            <Route path="/users" element={<Users/>}/>
        </Routes>
    );
}