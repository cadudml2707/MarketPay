import { Route, Routes } from "react-router-dom";
import { Login } from "./pages/login";
import { Menu } from "./pages/menu";
import { Users } from "./pages/users";

export function AppRoutes(){
    return(
        <Routes>
            <Route path="/" element={<Login/>} />
            <Route path="/menu" element={<Menu/>}/>
            <Route path="/users" element={<Users/>}/>
        </Routes>
    );
}