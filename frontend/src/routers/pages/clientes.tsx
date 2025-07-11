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

import ModalCadastraCliente from "../../components/Modal/modalCadastraCliente";

export function Clientes() {
  return (
    <Layout>
      <div className="flex flex-col p-10 gap-2">
        <div className="flex justify-between items-center">
          <h1 className="text-white font-bold text-2xl mb-5">Clientes</h1>
          <ModalCadastraCliente/>
        </div>
        <div className="overflow-x-auto w-full bg-white rounded-md shadow">
          <Table>
            <TableCaption>Lista de Produtos Cadastrados.</TableCaption>
            <TableHeader className="bg-[#363b3d]">
              <TableRow className="">
                <TableHead className="text-white">Nome</TableHead>
                <TableHead className="text-white">CPF</TableHead>
                <TableHead className="text-white">Telefone</TableHead>
              </TableRow>
            </TableHeader>
            <TableBody>
              <TableRow className="text-[#000000]">
                <TableCell>CARLOS EDUARDO DIAS MESSIAS DE LIMA</TableCell>
                <TableCell>000.000.000-00</TableCell>
                <TableCell>(00) 00000-0000</TableCell>
              </TableRow>
            </TableBody>
          </Table>
        </div>
      </div>
    </Layout>
  )
}
