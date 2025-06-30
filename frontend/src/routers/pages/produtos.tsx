import Layout from "../../components/layout/layout";

import {
    Table,
    TableBody,
    TableCaption,
    TableCell,
    TableHead,
    TableHeader,
    TableRow,
} from "@/components/ui/table"

export function Produtos() {
    return (
        <Layout>
            <div className="flex justify-center items-center p-6">
                <Table>
                    <TableCaption>Lista de Produtos Cadastrados.</TableCaption>
                    <TableHeader>
                        <TableRow>
                            <TableHead className="w-[100px]">Código</TableHead>
                            <TableHead>Nome</TableHead>
                            <TableHead>Quantidade</TableHead>
                            <TableHead className="text-right">Preço</TableHead>
                        </TableRow>
                    </TableHeader>
                    <TableBody>
                        <TableRow>
                            <TableCell className="font-medium">0001</TableCell>
                            <TableCell>Batata</TableCell>
                            <TableCell>24</TableCell>
                            <TableCell className="text-right">R$3.00</TableCell>
                        </TableRow>
                    </TableBody>
                </Table>
            </div>
        </Layout>
    );
}