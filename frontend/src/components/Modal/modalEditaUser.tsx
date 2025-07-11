import { Button } from "@/components/ui/button"

import {
    Dialog,
    DialogClose,
    DialogContent,
    DialogDescription,
    DialogFooter,
    DialogHeader,
    DialogTitle,
    DialogTrigger,
} from "@/components/ui/dialog"

import { MdEdit } from "react-icons/md";

import { Label } from "@radix-ui/react-label"
import { Input } from "../ui/input";

export default function modalEditaUser() {
    return (
        <Dialog>
            <form>
                <DialogTrigger asChild>
                    <Button className="bg-[#45cfef] hover:bg-[#45cfe0] cursor-pointer"><MdEdit /></Button>
                </DialogTrigger>
                <DialogContent className="sm:max-w-[425px] bg-[#363b3d] text-white">
                    <DialogHeader>
                        <DialogTitle>Editar Usuário</DialogTitle>
                        <DialogDescription className="text-white">
                            Informe os novos dados do Usuário.
                        </DialogDescription>
                    </DialogHeader>
                    <div className="grid gap-4">
                        <div className="grid gap-3">
                            <Label htmlFor="name-1">Nome <span className="text-[#FF0000]">*</span></Label>
                            <Input id="name-1" name="name" />
                        </div>
                        <div className="grid gap-3">
                            <Label htmlFor="username-1">E-mail <span className="text-[#FF0000]">*</span></Label>
                            <Input id="username-1" name="email" />
                        </div>
                        <div className="grid gap-3">
                            <Label htmlFor="username-1">Senha <span className="text-[#FF0000]">*</span></Label>
                            <Input id="username-1" name="senha" />
                        </div>
                        <div className="grid gap-3">
                            <Label htmlFor="username-1">Confirmar Senha <span className="text-[#FF0000]">*</span></Label>
                            <Input id="username-1" name="confirmaSenha" />
                        </div>
                    </div>
                    <DialogFooter>
                        <DialogClose asChild>
                            <Button variant="outline" className="border-[#45cfef] text-[#45cfef] bg-[#363b3d] hover:bg-[#45cfe0]">Cancelar</Button>
                        </DialogClose>
                        <Button type="submit" className="bg-[#45cfef] hover:bg-[#45cfe0] cursor-pointer">Salvar</Button>
                    </DialogFooter>
                </DialogContent>
            </form>
        </Dialog>
    );
}