import Layout from "../../components/layout/layout"

import {
    Table,
    TableBody,
    TableCaption,
    TableCell,
    TableHead,
    TableHeader,
    TableRow,
} from "@/components/ui/table"

import ModalCadastraUser from "../../components/Modal/modalCadastraUser";
import ModalEditaUser from "@/components/Modal/modalEditaUser";

export function Users() {
    return (
        <Layout>
            <div className="flex flex-col p-10 gap-2">
                <div className="flex justify-between items-center">
                    <h1 className="text-white font-bold text-2xl mb-5">Usuários</h1>
                    <ModalCadastraUser />
                </div>
                <div className="overflow-x-auto w-full bg-white rounded-md shadow">
                    <Table>
                        <TableCaption>Lista de Produtos Cadastrados.</TableCaption>
                        <TableHeader className="bg-[#363b3d]">
                            <TableRow>
                                <TableHead className="text-white">Nome</TableHead>
                                <TableHead className="text-white">E-mail</TableHead>
                                <TableHead className="text-white">Ações</TableHead>
                            </TableRow>
                        </TableHeader>
                        <TableBody>
                            <TableRow className="text-[#000000]">
                                <TableCell>CARLOS EDUARDO DIAS MESSIAS DE LIMA</TableCell>
                                <TableCell>carlos.dev@marketpay.com</TableCell>
                                <TableCell>
                                    <ModalEditaUser />
                                </TableCell>
                            </TableRow>
                        </TableBody>
                    </Table>
                </div>
            </div>
        </Layout>
    )
}
