import { useState } from 'react';
import { Label } from '@radix-ui/react-label';
import Layout from '../../components/layout/layout';
import { Input } from '@/components/ui/input';
import { Table } from 'lucide-react';
import { TableBody, TableCaption, TableCell, TableHead, TableHeader, TableRow } from '@/components/ui/table';
import { Button } from '@/components/ui/button';
import ModalCadastraCliente from "../../components/Modal/modalCadastraCliente";

export function Venda() {

    const [prodQtd, setProdQtd] = useState("3");
    const prodNome = "Produto";
    const prodCodigo = "1234567890";
    const prodPreco = "3.5";

    return (
        <Layout>
            <div className="flex flex-col p-10 gap-2">
                <h1 className='text-white font-bold text-2xl'>Bem-vindo(a) <span className='text-[#45cfef]'>Market</span><span className='text-[#d8fd12]'>Pay</span>!</h1>
                <div className="grid gap-3 mt-8">
                    <Label htmlFor="name-1">Produto</Label>
                    <Input className='bg-[#FFFFFF] text-[#000000]' id="name-1" name="name" value={prodNome} />
                </div>
                <div className='flex justify-between gap-5'>
                    {/* ESQUERDA */}
                    <div>
                        <div className='flex mt-2 gap-5'>
                            <div className="grid gap-3">
                                <Label htmlFor="name-1">Código</Label>
                                <Input className='bg-[#FFFFFF] text-[#000000]' id="name-1" name="name" value={prodCodigo} />
                            </div>
                            <div className="grid gap-3">
                                <Label htmlFor="name-1">Quantidade</Label>
                                <Input
                                    className='bg-[#FFFFFF] text-[#000000]'
                                    id="name-1"
                                    name="quantidade"
                                    value={prodQtd}
                                    onChange={(e) => setProdQtd(e.target.value)} />
                            </div>
                            <div className="grid gap-3">
                                <Label htmlFor="name-1">Preço</Label>
                                <Input className='bg-[#FFFFFF] text-[#000000]' id="name-1" name="name" value={`R$ ${prodPreco}`} />
                            </div>
                        </div>
                        <div className='flex gap-3 mt-2'>
                            <div className="grid gap-3">
                                <Label htmlFor="name-1">CPF do Cliente</Label>
                                <Input className='bg-[#FFFFFF] text-[#000000]' id="name-1" name="name" value={prodCodigo} />
                            </div>
                            <ModalCadastraCliente />
                        </div>
                        <div className="grid gap-3 mt-3">
                            <Label htmlFor="name-1">Código da Venda</Label>
                            <Input className='bg-[#FFFFFF] text-[#000000]' id="name-1" name="name" value="0987654321" />
                        </div>
                    </div>
                    {/* DIREITA */}
                    <div className="overflow-x-auto w-full bg-white rounded-md shadow">
                        <Table>
                            <TableCaption>Lista de Produtos Cadastrados.</TableCaption>
                            <TableHeader className="bg-[#363b3d]">
                                <TableRow>
                                    <TableHead className="w-[10rem] text-white">Código</TableHead>
                                    <TableHead className="text-white">Nome</TableHead>
                                    <TableHead className="text-white">Quantidade</TableHead>
                                    <TableHead className="text-white">Preço</TableHead>
                                </TableRow>
                            </TableHeader>
                            <TableBody>
                                <TableRow className="text-[#000000]">
                                    <TableCell className="font-medium">0001</TableCell>
                                    <TableCell>Batata</TableCell>
                                    <TableCell>24</TableCell>
                                    <TableCell>R$3.00</TableCell>
                                </TableRow>
                            </TableBody>
                        </Table>
                    </div>
                </div>
            </div>
        </Layout>
    );
}